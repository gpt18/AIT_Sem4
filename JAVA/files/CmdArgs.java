package files;
class CmdArgs {
    //Command Line arguments in Java
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("This command line"+" arguments are:");
            for(String val:args)
                System.out.println(val);
        } else {
            System.out.println("No command line "+"argumaents found.");
        }
    }
}
