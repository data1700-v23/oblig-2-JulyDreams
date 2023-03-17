package oslomet.webprog.oblig2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class BilettController {
    public final ArrayList<Biletter> alleBiletter = new ArrayList<>();

    @GetMapping("/lagre")
    public void lagreBiletter(Biletter innBilett){
        alleBiletter.add(innBilett);
    }
    @PostMapping("/hentAlle")
    public ArrayList<Biletter> hentAlle(){
        return alleBiletter;
    }
    @GetMapping("/slettAlt")
    public void slettAlt(){
        alleBiletter.clear();
    }
}

