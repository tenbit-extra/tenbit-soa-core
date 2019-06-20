package cn.tenbit.wolf.soa.core.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Author bangquan.qian
 * @Date 2019-06-18 15:35
 */
@Getter
@Setter
public class SoaResponse<T extends Serializable, E extends Serializable> implements Serializable {
    private static final long serialVersionUID = -3580565990518087877L;

    private Integer code;

    private Long timestamp = System.currentTimeMillis();

    private T data;

    private E error;

    private String trackId;
}
