package cn.edu.uestc.wsc.bbs_hiapk;

import cn.edu.uestc.wsc.bbs.URLMaker;

public class URLMakerhiapk implements URLMaker {

	@Override
	public  String createPostURL(String id, int page) {
		
		return "http://bbs.hiapk.com/forum.php?mod=viewthread&tid="+id+"&page="+page+"&mobile=no";
	}

	@Override
	public String createPostlistURL(int blockId, int page) {

		return "http://bbs.hiapk.com/forum.php?mod=forumdisplay&fid="+blockId+"&page="+page+"&mobile=no";
	}

}
