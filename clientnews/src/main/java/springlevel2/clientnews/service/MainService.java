package springlevel2.clientnews.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MainService {

    private ArrayList<String> newslist = new ArrayList<>();

    MainService(){
        for (int i = 0; i < 10; i++) {
            this.newslist.add(i,"News number "+i);
        }
    }

    public String getRandomNews() {
        return newslist.get((int)(Math.random()*10));
    }
}
