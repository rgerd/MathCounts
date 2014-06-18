package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import com.Section;

public class ProblemIO {
	public ArrayList<Section> readSections(String input_file) {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(new File(input_file)));
		} catch(Exception e) {
		}
		
		return null;
	}
}
