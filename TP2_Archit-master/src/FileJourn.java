import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileJourn implements IJournal {



	@Override
	public void outPut_Msg (String message) {

		try {
			File f = new File("C:\\Users\\HP2570p\\Desktop\\TP2_Archit-master\\TP2_Archit-master\\src\\journal.txt");
			FileWriter fw = new FileWriter(f, true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(message);
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

	}