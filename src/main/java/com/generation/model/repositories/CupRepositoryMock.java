package com.generation.model.repositories;

import java.util.ArrayList;
import java.util.List;

import com.generation.model.entities.Cup;


public class CupRepositoryMock  {

    private static  List<Cup> cupList = new ArrayList<Cup>();

    static
    {

        cupList.add(new Cup(1, "Ceramic", 19.99,300,true,"https://www.my-personaltrainer.it/2023/07/31/linguaggio-del-gatto_900x760.jpeg" ));
        cupList.add(new Cup(2, "Plastic", 3.99,300,false,"https://www.thoughtco.com/thmb/SC1JSp_KQzq3dHDcqvH-HZK6pBQ=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/GettyImages-186883675-58defd1a5f9b58ef7eebf11f.jpg" ));
        cupList.add(new Cup(3, "Silver", 89.99, 200,true,"https://upload.wikimedia.org/wikipedia/commons/f/f8/Monocle_with_gallery.jpg"));
    }

    public List<Cup> readAll() {
        return cupList;
    }

    public Cup readById(int id) {
        for(Cup a : cupList){
            if(a.getId()==id)
                return a;
        }
        return null;
    }

    public void insert(Cup a) {
        cupList.add(a);
    }

    public void update(Cup a) {
        int pos = _getIndex(a.getId());
        cupList.set(pos,a);
    }

    private int _getIndex(int id){

        int res = -1;
        for(int i = 0; i<cupList.size();i++){
            if(cupList.get(i).getId()==id)
                res = i;
        }
        return res;
    }


    public void delete(int id) {
        cupList.remove(_getIndex(id));
    }
    
}