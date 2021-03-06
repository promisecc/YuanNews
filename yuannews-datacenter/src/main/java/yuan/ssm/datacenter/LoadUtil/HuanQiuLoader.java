package yuan.ssm.datacenter.LoadUtil;

import yuan.ssm.datacenter.ParseUtil.ParseIndex;
import yuan.ssm.datacenter.base.LoaderBase;
import yuan.ssm.datacenter.base.SourceEnum;

import java.util.Set;

/**
 * ==================================================
 * <p/>
 * 版权：　软件工程.net12-1 原明卓
 * <p/>
 * 项目：　基于用户兴趣标签的新闻推荐系统
 * <p/>
 * 作者：　原明卓
 * <p/>
 * 版本：　1.0
 * <p/>
 * 创建日期：　16-5-4 上午9:57
 * <p/>
 * 功能描述：环球新闻主页加载类,返回urls
 * <p>
 * <p/>
 * 功能更新历史：
 * <p>
 * ==================================================
 */
public class HuanQiuLoader extends LoaderBase {


    public HuanQiuLoader(String url) {
        super(url);
    }

    protected Set<String> getUrls() {
        return cleanUrls(ParseIndex.getHuanQiuUrls(super.getDoc()), SourceEnum.huanqiu.toString());
    }

    protected SourceEnum getType() {
        return SourceEnum.huanqiu;
    }


}
