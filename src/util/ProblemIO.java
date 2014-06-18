package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;
import com.Problem;
import com.Section;

public class ProblemIO {
	public static ArrayList<Section> readSections(String input_file) {
		ArrayList<Section> sections = new ArrayList<Section>();
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(new File(input_file)));

			String line = null;

			while ((line = in.readLine()) != null) {
				if (line.replaceAll(" ", "").length() == 0 || line.startsWith("#"))
					continue;
				StringTokenizer st = new StringTokenizer(line, "\t");
				String title = st.nextToken();
				int level = Integer.parseInt(st.nextToken());
				HashMap<Integer, Integer> questions = new HashMap<Integer, Integer>();
				while (st.hasMoreTokens()) {
					String probs = st.nextToken();
					String[] _probs = probs.split(" ");
					int number = Integer.parseInt(_probs[0]);
					int type = Integer.parseInt(_probs[1].substring(1));
					questions.put(type, number);
				}

				Section section = new Section(title, level, questions);
				sections.add(section);
			}
		} catch (IOException e) {
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return sections;
	}

	public static void printProblems(String output_file, ArrayList<Problem> problems) {
		PrintWriter output = null;

		try {
			output = new PrintWriter(new File(output_file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		for (Problem problem : problems)
			output.println(problem == null ? "" : problem.toString());

		output.close();
	}
}
