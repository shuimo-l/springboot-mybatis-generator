package com.mapper;

import com.entity.PayRefund;
import java.util.List;

public interface PayRefundMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayRefund record);

    PayRefund selectByPrimaryKey(Integer id);

    List<PayRefund> selectAll();

    int updateByPrimaryKey(PayRefund record);
}