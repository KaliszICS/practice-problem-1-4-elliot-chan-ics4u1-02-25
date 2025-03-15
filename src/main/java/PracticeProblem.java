import java.io.*;

public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(getNumber(1, "file.txt"));
	}
	public static String getName(int lineNum, String file) {
		BufferedReader reader = null;
		String line = "";
		try {
			reader = new BufferedReader(new FileReader(file));
			
			String l;
			int localLineNum = 1;
			while((l = reader.readLine()) != null) {
				
				if(localLineNum == lineNum)
					line = l;
				localLineNum++;
			}
 		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if(line.equals(""))
				return line;
			try {
				if(reader != null)
				reader.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		String[] info = line.split(" ");
		return info[0] + " " + info[1];
	}

	public static int getAge(int lineNum, String file) {
		BufferedReader reader = null;
		String line = "";
		try {
			reader = new BufferedReader(new FileReader(file));
			
			String l;
			int localLineNum = 1;
			while((l = reader.readLine()) != null) {
				
				if(localLineNum == lineNum)
					line = l;
				localLineNum++;
			}
 		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if(line.equals(""))
				return -1;
			try {
				if(reader != null)
				reader.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		String[] info = line.split(" ");
		return Integer.parseInt(info[2]);
	}
	
	public static int getNumber(int lineNum, String file) {
		BufferedReader reader = null;
		String line = "";
		try {
			reader = new BufferedReader(new FileReader(file));
			
			String l;
			int localLineNum = 1;
			while((l = reader.readLine()) != null) {
				
				if(localLineNum == lineNum) 
					
					line = l;
					
				
				localLineNum++;
			}
 		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if(line.equals(""))
				return -1;
			try {
				if(reader != null)
				reader.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		String[] info = line.split(" ");
		return Integer.parseInt(info[3]);
	}
	
	public static void fileAppend(String output, String fileName) {
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(fileName, true)); //True allows it to append!
			writer.write(output);
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(writer != null)
					writer.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
