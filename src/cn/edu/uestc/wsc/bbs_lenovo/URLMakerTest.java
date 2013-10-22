package cn.edu.uestc.wsc.bbs_lenovo;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import cn.edu.uestc.wsc.webConnect.HtmlConnect;
import junit.framework.Assert;
import junit.framework.TestCase;

public class URLMakerTest extends TestCase {
	
	public void testCreatePostlistUrl(){
		int blockId=2; 
		int page=1;
		HtmlConnect con=new HtmlConnect();
		try {
			String url=URLMaker.createPostlistUrl(blockId, page);
			//System.out.print(url);
			Document doc=Jsoup.parse(
					con.getHtmlByUrl(url));
			Element ele=doc.select("#threadlisttableid").first();
			Assert.assertNotNull(ele);
		} catch (IOException e) {
			fail();
		}
	}
	
	
	public void testCreatePostUrl(){
		String postId="4379";
		int page=1;
		HtmlConnect con=new HtmlConnect();
		String url=URLMaker.createPostUrl(postId, page);
		Document doc;
		try {
			doc = Jsoup.parse(
					con.getHtmlByUrl(url));
			Element ele=doc.select(".t_fsz").first();
			Assert.assertNotNull(ele);
		} catch (IOException e) {
			fail();
		}
	}
}