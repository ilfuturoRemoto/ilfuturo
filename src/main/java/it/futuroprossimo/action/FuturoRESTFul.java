package it.futuroprossimo.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.futuroprossimo.bean.GrafoBean;

@RestController
@RequestMapping("/salva")
public class FuturoRESTFul {

	private static final Logger logger = LoggerFactory.getLogger(FuturoController.class);
	@PostMapping
    public @ResponseBody String post(
            @RequestBody GrafoBean grafo    ) {
        String method = "post";
        logger.info(method+": BEGIN");

        logger.debug(method+": GrafoBean=["+grafo+"]");
        logger.info(method+": END");

        return "OK";


    }

}
