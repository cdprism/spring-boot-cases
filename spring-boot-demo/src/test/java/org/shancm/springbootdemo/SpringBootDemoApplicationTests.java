package org.shancm.springbootdemo;

import com.csvreader.CsvWriter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;

import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {

	@Test
	public void contextLoads() throws Exception {
		location();
	}

	public static void main(String[] args) throws Exception {
		location();
	}


	public static void location() throws Exception {

		String locate = new File("").getAbsolutePath();
		File file = new File(locate + "/orders.csv");
		if (!file.createNewFile()) {
			throw new Exception("create new file fail");
		}
//		CsvWriter write = new CsvWriter(originFile.getAbsolutePath(), ',', Charset.forName("GBK"));
		CsvWriter write = new CsvWriter(file.getAbsolutePath(), ',', Charset.forName("UTF-8"));
		//各字段以引号标记
		write.setForceQualifier(true);
		//设置表头
		String[] strings = new String[20];
		List<String> titleColumnList = new ArrayList<>(8);
		titleColumnList.add("1");
		titleColumnList.add("2");
		titleColumnList.add("3");
		titleColumnList.add("4");
		strings = titleColumnList.toArray(strings);
		write.writeRecord(strings, true);

			write.close();
	}
}

