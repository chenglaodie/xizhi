package com.xizhi.activiti.mapper;

import java.util.List;

import com.xizhi.activiti.vo.HiProcInsVo;

public interface HistoryMapper
{
    List<HiProcInsVo> getHiProcInsListDone(HiProcInsVo hiProcInsVo);
}