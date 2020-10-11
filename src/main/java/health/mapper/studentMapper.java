package health.mapper;

import health.model.student;
import health.model.studentExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface studentMapper {
    long countByExample(studentExample example);

    int deleteByExample(studentExample example);

    int deleteByPrimaryKey(Date uploaddate);

    int insert(student record);

    int insertSelective(student record);

    List<student> selectByExample(studentExample example);

    student selectByPrimaryKey(Date uploaddate);

    int updateByExampleSelective(@Param("record") student record, @Param("example") studentExample example);

    int updateByExample(@Param("record") student record, @Param("example") studentExample example);

    int updateByPrimaryKeySelective(student record);

    int updateByPrimaryKey(student record);
}