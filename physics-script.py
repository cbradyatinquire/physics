import csv

def camel(x):
    final = ''
    upper = 1
    for item in x:
        if (upper == 1):
            final += item.upper()
            upper = 0
        else:
            if item == "-":
                upper = 1
            else:
                final += item
    return final

ifile  = open('physics-input.csv', "rb")
reader = csv.DictReader(ifile)

for row in reader:
    filename = "physics-output/"
    filename = filename + camel(row["prim-name"])
    filename = filename + ".java"
    ofile = open(filename, "wb")
    writer = csv.writer(ofile)

    ofile.write("import org.nlogo.api.*;")
    ofile.write("\nimport org.nlogo.core.Syntax;")
    ofile.write("\nimport org.nlogo.core.SyntaxJ;")

    if "" != row["output-type"]:
        ofile.write("\n\npublic class ")
        ofile.write(camel(row["prim-name"].strip()))
        ofile.write(" implements Reporter {")

        ofile.write("\n\n\tpublic Syntax getSyntax() {")
        ofile.write("\n\t\treturn SyntaxJ.reporterSyntax(")
        ofile.write("\n\t\t\tnew int[] {")

        input = row["input-type"].strip()
        if (input != ""):
            input = input.replace("string","String")
            input = input.replace("wildcard","Wildcard")
            input = input.replace("boolean","Boolean")
            input = input.replace("number","Number")
            input = input.replace("list","List")
            ofile.write(" Syntax.")
            ofile.write(input.replace(" ","").replace("(","").replace(")","").replace(";","Type(), Syntax."))
            ofile.write("Type()")
        ofile.write(" },")
        returnval = row["output-type"].strip()
        returnval = returnval.replace("(string)", "String")
        returnval = returnval.replace("(wildcard)", "Wildcard")
        returnval = returnval.replace("(boolean)", "Boolean")
        returnval = returnval.replace("(number)", "Number")
        returnval = returnval.replace("(list)", "List")
        ofile.write(" Syntax.")
        ofile.write(returnval.replace(" ", "").replace("(", "").replace(")", "").replace(";", "Type(), Syntax."))
        ofile.write("Type()")
        ofile.write(");")

        ofile.write("\n\t}")
        ofile.write("\n\n\tpublic Object report(Argument args[], Context context)")
        ofile.write("\n\t\tthrows ExtensionException {")
        ofile.write("\n\t\t\t")

        outtype = row["output-type"].strip()
        if (outtype == "(number)"):
            ofile.write("return Double.valueOf(42);")
            ofile.write("\n")

        if (outtype == "(wildcard)"):
            ofile.write("return Double.valueOf(42);")
            ofile.write("\n")

        if (outtype == "(boolean)"):
            ofile.write("return true;")
            ofile.write("\n")

        if (outtype == "(string)"):
            ofile.write("return \"hi\";")
            ofile.write("\n")

        if (outtype == "(list)"):
            ofile.write("LogoListBuilder list = new LogoListBuilder();")
            ofile.write("\n\t\t\tlist.add(42);")
            ofile.write("\n\t\t\treturn list.toLogoList();")
            ofile.write("\n")

        ofile.write("\n\t}")
        ofile.write("\n")
        ofile.write("\n}\n")
        ofile.close()

    if ("" == row["output-type"]):
        ofile.write("\n\npublic class ")
        ofile.write(camel(row["prim-name"].strip()))
        ofile.write(" implements Command {")

        ofile.write("\n\n\tpublic Syntax getSyntax() {")
        ofile.write("\n\t\treturn SyntaxJ.commandSyntax(")
        ofile.write("\n\t\t\tnew int[] {")

        input = row["input-type"].strip()
        if (input != ""):
            input = input.replace("string", "String")
            input = input.replace("wildcard", "Wildcard")
            input = input.replace("boolean", "Boolean")
            input = input.replace("number", "Number")
            input = input.replace("list", "List")
            ofile.write(" Syntax.")
            ofile.write(input.replace(" ", "").replace("(", "").replace(")", "").replace(";", "Type(), Syntax."))
            ofile.write("Type()")
        ofile.write(" });")

        ofile.write("\n\t}")
        ofile.write("\n\n\tpublic void perform(Argument args[], Context context)")
        ofile.write("\n\t\tthrows ExtensionException {")

        ofile.write("\n\t}")
        ofile.write("\n")
        ofile.write("\n}\n")
        ofile.close()

ifile.close()

ifile  = open('physics-input.csv', "rb")
reader = csv.DictReader(ifile)

ofile = open("physics-output/PhysicsExtension.java", "wb")
writer = csv.writer(ofile)

ofile.write("import org.nlogo.api.*;")
ofile.write("\npublic class PhysicsExtension extends DefaultClassManager {")
ofile.write("\n\tpublic void load(PrimitiveManager primitiveManager) {")

for row in reader:
    cmdname = row["prim-name"]
    classname = camel(cmdname)
    ofile.write("\n\t\tprimitiveManager.addPrimitive( \"")
    ofile.write(cmdname)
    ofile.write("\", new ")
    ofile.write(classname)
    ofile.write("() );")

ofile.write("\n\t}")
ofile.write("\n}")

ofile.close();
ifile.close();
