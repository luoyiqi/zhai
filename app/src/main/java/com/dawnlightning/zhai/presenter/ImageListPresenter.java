package com.dawnlightning.zhai.presenter;

import android.content.Context;

import com.dawnlightning.zhai.base.Actions;
import com.dawnlightning.zhai.bean.ImageListBean;
import com.dawnlightning.zhai.model.ImageListModel;
import com.dawnlightning.zhai.view.IBaseFragmentView;

import java.util.List;

/**
 * Created by Administrator on 2016/5/4.
 */
public class ImageListPresenter implements ImageListModel.ImageListLisenter {
    private ImageListModel model;
    private IBaseFragmentView view;

    public ImageListPresenter(IBaseFragmentView view){
        this.view=view;
        this.model=new ImageListModel();
    }

    public void loadImageList(int page,int classify,Actions action){
        model.getTianGouImageList(page, classify, this, action);
    }
    public void loadBeatifyLegList(int page,Actions action){
        //model.jsoupGetImageList(page,this,action);//官网
        model.umeiGetImageList(page, this, action);
    }
    public void loadBeiLaQiList(int page,int classify,Actions action){

        model.getBeilaQiImageList(page, classify, this, action);
    }
    @Override
    public void getSuccess(List<ImageListBean> list, Actions action, int totalpage) {
        view.showImageList(list, action, totalpage);
    }

    @Override
    public void getFailure(int code, String msg,Actions action) {
        view.showError(code,msg,action);
    }

}
