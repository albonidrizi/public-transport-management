SELECT * FROM public_transport_sys_mng.station_hours;
###########################################################
/*Linja 1 nisje 1*/
SELECT uejl, molino, bexhetiKompani, hitMobilie, makPetrol, shipadi, rotring, xhamiaLarme,  gjygji, fitnesArena, pallatiKultures, ronaldo, veroJambo, pallmaMall, stacioniAutobuseve FROM public_transport_sys_mng.station_hours WHERE line_id=1 AND position_id=1;
/*Linja 1 kthim 2   */
SELECT stacioniAutobuseve, pallmaMall, veroJambo, ronaldo, pallatiKultures, fitnesArena, gjygji, xhamiaLarme, rotring, shipadi, makPetrol, hitMobilie, bexhetiKompani, molino, uejl   FROM public_transport_sys_mng.station_hours WHERE line_id=1 AND position_id=2;
###########################################################
/*Linja 2 nisje 1*/
SELECT  xhepcishtRenova, xhepcishtAlpi, xhepcishtVenecia, porojShkolla, porojIra, xhamiaDrenovec, shkolla7marsi, cerdhePotok, shkollaMuzikes,shparkaseBank, gjygji, xhamiaLarme, embeltoreMostar1, shipadi, makPetrol, mobiljeAntillop, bexhetiKompani, molino, uejl  FROM public_transport_sys_mng.station_hours WHERE line_id=2 AND position_id=1;   
/*Linja 2 kthim 2   */
SELECT uejl,  molino, bexhetiKompani, mobiljeAntillop, makPetrol,  shipadi, embeltoreMostar1, xhamiaLarme,   gjygji,  shparkaseBank, shkollaMuzikes, cerdhePotok, shkolla7marsi,  xhamiaDrenovec, porojIra, porojShkolla, xhepcishtVenecia, xhepcishtAlpi, xhepcishtRenova FROM public_transport_sys_mng.station_hours WHERE line_id=2 AND position_id=2;    
###########################################################
/*Linja 3 nisje 1*/
SELECT recicMadhe, shkollaPerparimiRM, varrezatRecicVogel, rKurtishi, arabati, varrezatQytetit, rotring, xhamiaLarme, gjygji, fitnesArena, pallatiKultures, ronaldo, veroJambo, stacioniAutobuseve FROM public_transport_sys_mng.station_hours WHERE line_id=3 AND position_id=1;
/*Linja 3 kthim 2*/
SELECT stacioniAutobuseve , veroJambo, ronaldo, pallatiKultures, fitnesArena, gjygji, xhamiaLarme, rotring, varrezatQytetit, arabati,   rKurtishi, varrezatRecicVogel, shkollaPerparimiRM, recicMadhe FROM public_transport_sys_mng.station_hours WHERE line_id=3 AND position_id=2;
###########################################################