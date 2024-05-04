package dao.impl;

import dao.AreaDao;
import dao.BaseDao;
import pojo.Area;

import java.util.List;

/**
 * @Author: Ma HaiYang
 * @Description: MircoMessage:Mark_7001
 */
public class AreaDaoImpl extends BaseDao implements AreaDao {

    @Override
    public List<Area> findByParentID(int parentID) {
        String sql="select * from area where parentid= ?";
        return baseQuery(Area.class, sql, parentID);
    }
}
