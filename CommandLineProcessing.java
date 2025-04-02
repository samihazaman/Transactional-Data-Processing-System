
public class CommandLineProcessing {
	
    public static void main(String args[]) {

        int i = 0;
        String arg;
        boolean vflag = false;
        String inputfile = "";
        String outputfile = "";
        String directoryPath = "";
        String transactionLog = "";

        while (i < args.length && args[i].startsWith("-")) {
            arg = args[i++];

            // Check for verbose flag
            if (arg.equals("-verbose")) {
                System.out.println("Verbose mode on");
                vflag = true;
            }

            // Parse input file name
            else if (arg.equals("-input")) {
                if (i < args.length)
                    inputfile = args[i++];
                else
                    System.err.println("-input requires a filename");
                if (vflag)
                    System.out.println("Input file = " + inputfile);
            }

            // Parse output file name
            else if (arg.equals("-output")) {
                if (i < args.length)
                    outputfile = args[i++];
                else
                    System.err.println("-output requires a filename");
                if (vflag)
                    System.out.println("Output file = " + outputfile);
            }

            // Parse directory path
            else if (arg.equals("-directory")) {
                if (i < args.length)
                    directoryPath = args[i++];
                else
                    System.err.println("-directory requires a directory path");
                if (vflag)
                    System.out.println("Directory path = " + directoryPath);
            }

            // Parse transaction log
            else if (arg.equals("-transactionlog")) {
                if (i < args.length)
                    transactionLog = args[i++];
                else
                    System.err.println("-transactionlog requires a filename");
                if (vflag)
                    System.out.println("Transaction log = " + transactionLog);
            }

            // Handle other flags
            else {
                System.err.println("ParseCmdLine: illegal option " + arg);
            }
        }

        if (i == args.length) {            
            System.err.println("Usage: ParseCmdLine [-verbose] [-input inputfile] [-output outputfile] [-directory directoryPath] [-transactionlog transactionLog]");
        } 
        else {
            System.out.println("All arguments parsed successfully!");
        }
           
    }

}

