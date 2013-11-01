package cn.edu.uestc.wsc.bbs_360;

import cn.edu.uestc.wsc.bbs.URLMaker;

/*
 * @function 网页URL生成
 * */
public class URLMaker360 implements URLMaker {

	@Override
	public String createPostURL(String id, int page) {
		return "http://bbs.360safe.com/forum.php?mod=viewthread&tid="+id+"&page="+page+"&mobile=no";
	}

	@Override
	public String createPostlistURL(int blockId, int page) {
		return "http://bbs.360safe.com/forum.php?mod=forumdisplay&fid="+blockId+"&page="+page+"&mobile=no";
	}
}
