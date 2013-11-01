package cn.edu.uestc.wsc.bbs_hiapk;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import cn.edu.uestc.wsc.bbs.BlockManager;
import cn.edu.uestc.wsc.bbs.URLMaker;
import cn.edu.uestc.wsc.webConnect.HtmlConnect;

import junit.framework.TestCase;

public class BlockManagerhiapkTest extends TestCase {
	public void testNext(){
		HtmlConnect con=new HtmlConnect();
		URLMaker url=new URLMakerhiapk();
		BlockManager block=new BlockManagerhiapk();
		for(int i=0;i<block.blockSize();i++) {
			int bl=block.next();
			Document doc;
			try {
				doc = Jsoup.parse(con.getHtmlByUrl(url.createPostlistURL(bl,1)));
				if(doc.select("#threadlist").first()==null){
					System.out.println(bl);
					fail();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		} 
	}

