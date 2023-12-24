package org.chihx.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;


/**
 * @author Faker
 * @implNote ProductOrderDO
 * @since 2023-12-23
 */
@Data
@TableName("product_order")
public class ProductOrderDO {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String outTradeNo;

    private String state;

    private Date createTime;

    private Double payAmount;

    private String nickname;

    private Long userId;
}
