package hacker.framework.common.object;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 基础转换 其实分页工具会自动计算，只需要num和size即可
 *
 * @Description: J X N H
 * @EnglishName LuKe
 * @authod LiuQi(walker)
 * @date 2019/6/15 23:15
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BaseConditionVo {

    public final static int DEFAULT_PAGE_SIZE = 10;
    private int pageNum = 1;
    private int pageSize = 0;
    private int pageStart = 0;
    private String orderField;
    private String orderDirection;
    private String keywords;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;

    public int getPageSize() {
        return pageSize > 0 ? pageSize : DEFAULT_PAGE_SIZE;
    }

    public int getPageStart() {
        return pageNum > 0 ? (pageNum - 1) * pageSize : 0;
    }
}
