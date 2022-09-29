package com.ned.armstrong.library.springbootlibrary.repository;

import com.ned.armstrong.library.springbootlibrary.model.CheckOut;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CheckOutRepository extends CrudRepository<CheckOut, Integer> {

    List<CheckOut> findAll();

    CheckOut findByCheckoutId(Integer id);

//    select b.id, b.title, a.name as author, s.sectionName as section, s.location, b.deweyDecimal,
//            case when c.bookId IS NULL
//    then 'Available'
//            else 'Checked Out'
//    end as status,
//    c.dueDate
//    @Query("""
//            select new com.ned.armstrong.library.springbootlibrary.dto.CheckoutResultsDto(b.id, b.title, a.name as author, s.sectionName as section, s.location, b.deweyDecimal,
//            	case when c.bookId IS NULL
//            		then 'Available'
//            	else 'Checked Out'
//                end as status,
//                c.dueDate)
//            from Book b
//            	left join CheckOut c on b.id = c.bookId
//            	join Section s on b.sectionId = s.sectionId
//                	join Author a on b.authorId = a.authorId
//            where b.title like '%raven%'
//            """)
//    List<CheckoutResultsDto> findCheckoutResults(String title);

}
