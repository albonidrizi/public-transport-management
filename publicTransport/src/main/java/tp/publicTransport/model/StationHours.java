package tp.publicTransport.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;

@Entity @Table(name ="station_hours" )
@Getter @Setter
public class StationHours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false, unique = true)
    private int id;


    @ManyToOne
    @JoinColumn(name = "line_id")
    private Line lineId;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position positionId;


    @Column(name = "uejl", nullable = true, unique = false)
    private Time uejl;

    @Column(name = "molino", nullable = true, unique = false)
    private Time molino;

    @Column(name = "bexhetiKompani", nullable = true, unique = false)
    private Time bexhetiKompani;

    @Column(name = "hitMobilie", nullable = true, unique = false)
    private Time hitMobilie;

    @Column(name = "makPetrol", nullable = true, unique = false)
    private Time makPetrol;

    @Column(name = "shipadi", nullable = true, unique = false)
    private Time shipadi;

    @Column(name = "rotring", nullable = true, unique = false)
    private Time rotring;

    @Column(name = "xhamiaLarme", nullable = true, unique = false)
    private Time xhamiaLarme;

    @Column(name = "gjygji", nullable = true, unique = false)
    private Time gjygji;

    @Column(name = "fitnesArena", nullable = true, unique = false)
    private Time fitnesArena;

    @Column(name = "pallatiKultures", nullable = true, unique = false)
    private Time pallatiKultures;

    @Column(name = "ronaldo", nullable = true, unique = false)
    private Time ronaldo;

    @Column(name = "veroJambo", nullable = true, unique = false)
    private Time veroJambo;

    @Column(name = "pallmaMall", nullable = true, unique = false)
    private Time pallmaMall;

    @Column(name = "stacioniAutobuseve", nullable = true, unique = false)
    private Time stacioniAutobuseve;

    @Column(name = "xhepcishtRenova", nullable = true, unique = false)
    private Time xhepcishtRenova;

    @Column(name = "xhepcishtAlpi", nullable = true, unique = false)
    private Time xhepcishtAlpi;

    @Column(name = "xhepcishtVenecia", nullable = true, unique = false)
    private Time xhepcishtVenecia;

    @Column(name = "porojShkolla", nullable = true, unique = false)
    private Time porojShkolla;

    @Column(name = "porojIra", nullable = true, unique = false)
    private Time porojIra;

    @Column(name = "xhamiaDrenovec", nullable = true, unique = false)
    private Time xhamiaDrenovec;

    @Column(name = "shkolla7marsi", nullable = true, unique = false)
    private Time shkolla7marsi;

    @Column(name = "cerdhePotok", nullable = true, unique = false)
    private Time cerdhePotok;

    @Column(name = "shkollaMuzikes", nullable = true, unique = false)
    private Time shkollaMuzikes;

    @Column(name = "shparkaseBank", nullable = true, unique = false)
    private Time shparkaseBank;

    @Column(name = "embeltoreMostar1", nullable = true, unique = false)
    private Time embeltoreMostar1;

    @Column(name = "mobiljeAntillop", nullable = true, unique = false)
    private Time mobiljeAntillop;

    @Column(name = "recicMadhe", nullable = true, unique = false)
    private Time recicMadhe;

    @Column(name = "shkollaPerparimiRM", nullable = true, unique = false)
    private Time shkollaPerparimiRM;

    @Column(name = "varrezatRecicVogel", nullable = true, unique = false)
    private Time varrezatRecicVogel;

    @Column(name = "rKurtishi", nullable = true, unique = false)
    private Time rKurtishi;

    @Column(name = "arabati", nullable = true, unique = false)
    private Time arabati;

    @Column(name = "varrezatQytetit", nullable = true, unique = false)
    private Time varrezatQytetit ;
}

