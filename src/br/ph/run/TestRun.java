package br.ph.run;

import br.ph.entity.FileVO;
import br.ph.readers.Reader;

public class TestRun {
	
	public static void main(String[] args) throws Exception {
		String line = "abcdefghij02012345678900";
		FileVO fileVO = new FileVO();
		
		Reader.parse(line, fileVO);
		
		System.out.println(fileVO);
	}
}
