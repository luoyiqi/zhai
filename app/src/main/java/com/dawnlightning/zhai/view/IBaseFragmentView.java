package com.dawnlightning.zhai.view;

import com.dawnlightning.zhai.base.Actions;
import com.dawnlightning.zhai.bean.ImageListBean;

import java.util.List;

/**
 * Created by Administrator on 2016/5/4.
 */
public interface IBaseFragmentView{
    public void showImageList(List<ImageListBean> list, Actions action, int totalpage);
    public void showError(int code,String msg,Actions action);

}
