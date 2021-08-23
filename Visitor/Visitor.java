package com.company;

public interface Visitor {
    void VisitZwierze(Zwierze z);
    void VisitPtak(Ptak p);
    void VisitRyba(Ryba r);
    void VisitSsak(Ssak s);
    void VisitGady(Gad g);
}
