package service;

import pojo.Area;

import java.util.List;

/**
 * @Author: Ma HaiYang
 * @Description: MircoMessage:Mark_7001
 */
public interface AreaService {
    List<Area> findByParentID(Integer parentID);
}
