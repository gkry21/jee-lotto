package com.lotto.web.daoimpl;

import java.io.File;
import java.io.BufferedWriter;
import java.io.File;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import com.lotto.web.daos.ConsumerDao;
import com.lotto.web.domains.ConsumerBean;

public class ConsumerDAOImpl implements ConsumerDao{
	public static final String FILE_PATH = String.format("C:%sUsers%suser%seclipse-jee%sjee_lotto1%sWebContent%sresources%stxt%s",
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator
			);
	@Override
	public void insertConsumer(ConsumerBean param) {
		System.out.println("insertConsumer :"+param.toString());
		try {
			File file = new File(FILE_PATH+ "consumer.txt");
			@SuppressWarnings("resource")
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(String.format("%s,%s", param.getCid(), param.getPw()));
			writer.newLine();
			writer.flush();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
