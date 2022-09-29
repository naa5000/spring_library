package com.ned.armstrong.library.springbootlibrary.resource;

import com.ned.armstrong.library.springbootlibrary.dto.CheckoutResultsDto;
import com.ned.armstrong.library.springbootlibrary.model.CheckOut;
import com.ned.armstrong.library.springbootlibrary.repository.CheckOutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/checkout")
public class CheckOutResource {

    @Autowired
    CheckOutRepository checkOutRepository;

    @GetMapping(value = "/all")
    public List<CheckOut> getAll() {
        return checkOutRepository.findAll();
    }

    @PostMapping(value = "/save")
    public List<CheckOut> persist(@RequestBody final CheckOut checkOut){
        checkOutRepository.save(checkOut);
        return checkOutRepository.findAll();
    }

    @GetMapping()
    public CheckOut findById(@RequestParam Integer id){
        return checkOutRepository.findByCheckoutId(id);
    }

//    @GetMapping(value = "/results")
//    public List<CheckoutResultsDto> getCheckoutResults(@RequestParam String title){
//        //TODO: Getting org.springframework.core.convert.ConverterNotFoundException
//        return checkOutRepository.findCheckoutResults(title);
//    }
}
