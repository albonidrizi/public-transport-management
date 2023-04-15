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

    @Column(name = "bexheti_kompani", nullable = true, unique = false)
    private Time bexhetiKompani;

    @Column(name = "hit_mobilie", nullable = true, unique = false)
    private Time hitMobilie;

    @Column(name = "mak_petrol", nullable = true, unique = false)
    private Time makPetrol;

    @Column(name = "shipadi", nullable = true, unique = false)
    private Time shipadi;

    @Column(name = "rotring", nullable = true, unique = false)
    private Time rotring;

    @Column(name = "xhamia_larme", nullable = true, unique = false)
    private Time xhamiaLarme;

    @Column(name = "gjygji", nullable = true, unique = false)
    private Time gjygji;

    @Column(name = "fitnes_arena", nullable = true, unique = false)
    private Time fitnesArena;

    @Column(name = "pallati_kultures", nullable = true, unique = false)
    private Time pallatiKultures;

    @Column(name = "ronaldo", nullable = true, unique = false)
    private Time ronaldo;

    @Column(name = "vero_jambo", nullable = true, unique = false)
    private Time veroJambo;

    @Column(name = "pallma_mall", nullable = true, unique = false)
    private Time pallmaMall;

    @Column(name = "stacioni_autobuseve", nullable = true, unique = false)
    private Time stacioniAutobuseve;

    @Column(name = "xhepcisht_renova", nullable = true, unique = false)
    private Time xhepcishtRenova;

    @Column(name = "xhepcisht_alpi", nullable = true, unique = false)
    private Time xhepcishtAlpi;

    @Column(name = "xhepcisht_venecia", nullable = true, unique = false)
    private Time xhepcishtVenecia;

    @Column(name = "poroj_shkolla", nullable = true, unique = false)
    private Time porojShkolla;

    @Column(name = "poroj_ira", nullable = true, unique = false)
    private Time porojIra;

    @Column(name = "xhamia_drenovec", nullable = true, unique = false)
    private Time xhamiaDrenovec;

    @Column(name = "shkolla_7_marsi", nullable = true, unique = false)
    private Time shkolla7marsi;

    @Column(name = "cerdhe_potok", nullable = true, unique = false)
    private Time cerdhePotok;

    @Column(name = "shkolla_muzikes", nullable = true, unique = false)
    private Time shkollaMuzikes;

    @Column(name = "shparkase_bank", nullable = true, unique = false)
    private Time shparkaseBank;

    @Column(name = "embeltore_mostar1", nullable = true, unique = false)
    private Time embeltoreMostar1;

    @Column(name = "mobilje_antillop", nullable = true, unique = false)
    private Time mobiljeAntillop;

    @Column(name = "recic_madhe", nullable = true, unique = false)
    private Time recicMadhe;

    @Column(name = "shkolla_perparimi_rm", nullable = true, unique = false)
    private Time shkollaPerparimiRM;

    @Column(name = "varrezat_recic_vogel", nullable = true, unique = false)
    private Time varrezatRecicVogel;

    @Column(name = "r_kurtishi", nullable = true, unique = false)
    private Time rKurtishi;

    @Column(name = "arabati", nullable = true, unique = false)
    private Time arabati;

    @Column(name = "varrezat_qytetit", nullable = true, unique = false)
    private Time varrezatQytetit ;
}

