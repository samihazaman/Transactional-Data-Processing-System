import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;


public class TransactionLog {
	
    private FileWriter transactionLog;

    
    public TransactionLog(String logFileName) throws IOException {
    	
    	//creates an empty transaction log
        this.transactionLog = new FileWriter(logFileName);
    }
    
    public void close() throws IOException {
        transactionLog.close();
    }      
      
      //method that takes in a specific command and the fields in the data storage
      public void writeTransactionLog(String command, String[] fields) throws IOException {
    	  
    	    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    	    
    	    //initializes a StringBuilder object that will contain the timestamp, the command and other fields that get appended to it
    	    StringBuilder logEntry = new StringBuilder(timestamp + " | " + command);
    	    
    	    //goes through each field
    	    for (String field : fields) {
    	        logEntry.append(" | ").append(field); //add a "|" first and then append the field
    	    }
    	    
    	    logEntry.append("\n"); //creates a new line
    	    transactionLog.write(logEntry.toString()); //write the fields to the transaction log
    	}

      

      public static void main(String[] args) {
    	  
          try {
              // Open input file
              BufferedReader reader = new BufferedReader(new FileReader("input_file.txt"));
              
              // Create transaction log
              TransactionLog transactionLog = new TransactionLog("transaction.log");
                      

              String line;           
              while ((line = reader.readLine()) != null) {
                 
            	  // Split the line by when coming across '|'
            	  String[] fields = line.split("\\|");
                  
                  String command = fields[0]; //the name of command is located at index 0
                  
                  String[] parameters = new String[fields.length - 1]; // an array that stores fields.length = 12, 12-1 = 11, since index starts at 0
                  for (int i = 1; i < fields.length; i++) {  //goes through each field
                      parameters[i - 1] = fields[i];  //parameter is assigned a value of the field at that index
                  }
                  
                         
                  // Write transaction log with timestamp
                  transactionLog.writeTransactionLog(command, parameters);
              }
              
              // Close input file and transaction log
              reader.close();
              transactionLog.close();
          } 
          
          catch (IOException e) {
              e.printStackTrace();
          }
      }
	    	  
 }
