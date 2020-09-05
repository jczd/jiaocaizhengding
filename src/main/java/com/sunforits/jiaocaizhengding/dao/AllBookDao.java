package com.sunforits.jiaocaizhengding.dao;

        import com.sunforits.jiaocaizhengding.entity.AllBook;
        import org.apache.ibatis.annotations.Delete;
        import org.apache.ibatis.annotations.Insert;
        import org.apache.ibatis.annotations.Mapper;
        import org.apache.ibatis.annotations.Select;

        import java.util.List;

/**
 * 订单的增删改查
 * @date 2020/5/17-17:10
 */
@Mapper
public interface AllBookDao {

    //添加书籍
    @Insert("insert into allbook (book,chubanshe,shuliang,zuozhe,teacher) values (#{book},#{chubanshe},#{shuliang},#{zuozhe},#{teacher})")
    public void allSaveBook(AllBook allBook);
    //删除书籍
    @Delete("delete from allbook where book = #{book} ")
    int allDeleteBook(String name);

    //查看所有
    @Select("select * from allbook")
    public List<AllBook> allFindAll();


    //老师操作部分


    //查看所有
    @Select("select * from allbook where teacher = #{teacher}")
    public List<AllBook> allFindOne(String name);

    //删除书籍
    @Delete("delete from allbook where book = #{book} and teacher=#{teacher}")
    int teacherDeleteBook(String book,String teacher);

}
