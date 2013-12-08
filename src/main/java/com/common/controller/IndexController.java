package com.common.controller;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUEngine;
import org.bouncycastle.pqc.crypto.ntru.NTRUParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUSigner;
import org.bouncycastle.pqc.crypto.ntru.NTRUSigningParameters;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping("/index.html")
    public String getIndexPage() {
        return "WEB-INF/pages/index.jsp";
    }

    @RequestMapping(value="IndexController/generateNtruParams.jsp",method= RequestMethod.POST)
    public @ResponseBody String re() {


        NTRUSigningParameters ntruSigningParameters = new NTRUSigningParameters(0,0,0,0,0,0,null);
        NTRUSigner ntruSigner = new NTRUSigner(ntruSigningParameters);
//        CipherParameters


        return null;
    }
}
