package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
@RequestMapping("/")
public class VizitkaController {

    private final List<Vizitka> vizitky;

    public VizitkaController() {
        vizitky = Arrays.asList(
                new Vizitka("Tomáš Sokol", "Domácí zvířata", "Hrnčířská 120", "59501 Velká Bíteš", "sokol@nasezvire.cz", "+420 758833694", "www.nasezvire.cz"),
                new Vizitka("Petr Ostrý", "Stavebniny s r.o.", "Velkopavlovická 21", "62800 Brno", "PetrOstry@stav.eu", null, "www.stavebniny.com"),
                new Vizitka("Libuše Horáčková", "Nej Firma a.s.", "Požární 8", "36005 Karlovy Vary", null, "+420 451232154", "www.nejfirma.cz"),
                new Vizitka("Stanislav Kutil", "Zahrada a.s.", "Kamenná 5", "35002 Cheb", null, "+420 236-859-566", null),
                new Vizitka("Bořivoj Kudláček", "Albion a.s.", "Mostecká 123", null, "borek@albion.com", "+420 968-333-666", "www.albion.eu/borek"),
                new Vizitka("Kateřina Krásná", "Hrady s r.o.", "hrad Bouzov", "78325 Bouzov", null, "+420 775 888 960", null)
        );
    }

    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView modelAndView = new ModelAndView("seznam");
        modelAndView.addObject("seznam", vizitky);
        return modelAndView;
    }

    @GetMapping("/detail")
    public ModelAndView detail(int id) {
        ModelAndView modelAndView = new ModelAndView("detail");
        modelAndView.addObject("detail", vizitky.get(id));
        return modelAndView;

    }
}
