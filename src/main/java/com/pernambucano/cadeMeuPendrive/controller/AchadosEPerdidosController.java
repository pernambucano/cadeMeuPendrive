package com.pernambucano.cadeMeuPendrive.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AchadosEPerdidosController {

    @RequestMapping("/")
    public String listItensPerdidos(){
        return "index";
    }

    @RequestMapping("/itemPerdido")
    @ResponseBody
    public String getItemPerdido(){
        return "Retornando um item perdido.";
    }

}
