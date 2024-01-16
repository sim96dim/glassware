package com.generation.model.repositories;

import java.util.ArrayList;
import java.util.List;

import com.generation.model.entities.Glass;


public class GlassRepositoryMock  {

    private static  List<Glass> glassList = new ArrayList<Glass>();

    static
    {

        glassList.add(new Glass(1, "Ceramic", 19.99,300,"blue","waterglass" ));
        glassList.add(new Glass(2, "Plastic", 3.99,300,"red", "wineglass"));
        glassList.add(new Glass(3, "Silver", 89.99, 200,"yellow","beerglass"));
    }

    public List<Glass> readAll() {
        return glassList;
    }

    public Glass readById(int id) {
        for(Glass a : glassList){
            if(a.getId()==id)
                return a;
        }
        return null;
    }

    public void insert(Glass a) {
        glassList.add(a);
    }

    public void update(Glass a) {
        int pos = _getIndex(a.getId());
        glassList.set(pos,a);
    }

    private int _getIndex(int id){

        int res = -1;
        for(int i = 0; i<glassList.size();i++){
            if(glassList.get(i).getId()==id)
                res = i;
        }
        return res;
    }


    public void delete(int id) {
        glassList.remove(_getIndex(id));
    }
    
}