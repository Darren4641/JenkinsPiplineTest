package com.example.jayurountestfordarren.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * -------------------------------------------------------------------------------------
 * ::::::'OO::::'OOO::::'OO:::'OO:'OO::::'OO:'OOOOOOOO:::'OOOOOOO::'OO::::'OO:'OO....OO:
 * :::::: OO:::'OO OO:::. OO:'OO:: OO::::.OO: OO.....OO:'OO.....OO: OO:::: OO: OOO...OO:
 * :::::: OO::'OO:..OO:::. OOOO::: OO::::.OO: OO::::.OO: OO::::.OO: OO:::: OO: OOOO..OO:
 * :::::: OO:'OO:::..OO:::. OO:::: OO::::.OO: OOOOOOOO:: OO::::.OO: OO:::: OO: OO.OO.OO:
 * OO:::: OO: OOOOOOOOO:::: OO:::: OO::::.OO: OO.. OO::: OO::::.OO: OO:::: OO: OO..OOOO:
 * :OO::::OO: OO.....OO:::: OO:::: OO::::.OO: OO::. OO:: OO::::.OO: OO:::: OO: OO:..OOO:
 * ::OOOOOO:: OO:::..OO:::: OO::::. OOOOOOO:: OO:::. OO:. OOOOOOO::. OOOOOOO:: OO::..OO:
 * :......:::..:::::..:::::..::::::.......:::..:::::..:::.......::::.......:::..::::..::
 * <p>
 * packageName    : com.example.jayurountestfordarren.controller
 * fileName       : Controller
 * author         : darren
 * date           : 1/8/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 1/8/24        darren       최초 생성
 */
@RestController
@RequiredArgsConstructor
public class Controller {

    /**
     * Test one string.
     * <p>
     * detailed description
     * </p>
     *
     * @return the string
     * @author : zxz4641@jayuroun.com
     */
    @GetMapping("/test/one")
    public String testOne() {
        return "TestOne";
    }

    /**
     * Test two string.
     * <p>
     * detailed description
     * </p>
     *
     * @param name the name
     * @return the string
     * @author : zxz4641@jayuroun.com
     */
    @GetMapping("/test/two/{name}")
    public String testTwo(@PathVariable String name) {
        return "TestTwo : " + name;
    }
}
