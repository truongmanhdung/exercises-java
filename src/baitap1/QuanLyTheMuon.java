package baitap1;

import java.util.ArrayList;
import java.util.List;

public class QuanLyTheMuon {
    List<TheMuon> listTheMuon = new ArrayList();
    public static void main(String[] args) {

    }

    public void themPhieuMuon(TheMuon theMuon){
        listTheMuon.add(theMuon);
    }

    public void xoaPhieuMuon(String maTheMuon){
        listTheMuon.removeIf(list -> (list.getMaPhieuMuon().equals(maTheMuon)));
    }
}
