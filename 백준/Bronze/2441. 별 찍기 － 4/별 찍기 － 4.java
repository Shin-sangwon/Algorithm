import java.util.*;
import java.math.*;
import java.io.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		int cnt = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < cnt; i++) {
			for(int j = 0; j <cnt; j++) {
				if(j < i) bw.write(" ");
				else bw.write("*");				
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
			
}