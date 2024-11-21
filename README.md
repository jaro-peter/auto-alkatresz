# auto-alkatresz
            

## **1. Összefoglaló**  
Az alkalmazás egy online platformot valósít meg, amely autoalkatrészek értékesítésére szolgál. A webshop célja, hogy egyszerű és hatékony módon biztosítson hozzáférést különböző autóalkatrészekhez mind egyéni, 
mind vállalati ügyfelek számára.  

### **Megrendelő és igényei**  
- **Megrendelő:** Egy autóipari kereskedelmi vállalkozás, amely bővíteni kívánja értékesítési csatornáit.  
- **Használat módja:**  
  - Az ügyfelek regisztráció után böngészhetik a termékeket, akciókat, és rendeléseket adhatnak le.  
  - Az adminisztrátorok kezelhetik a termékkínálatot, akciókat hozhatnak létre, és nyomon követhetik a rendelések állapotát.  

---

## **2. Követelmények**  

### **Funkcionális követelmények**  
1. **Alkatrészek egységes kezelése**  
   - Minden termék azonos attribútumokkal rendelkezik, például: *név, cikkszám, ár, gyártó, készletmennyiség.*  
2. **Termékcsoportok kezelése**  
   - Az alkatrészek kategóriákba sorolása (*pl. motor, fékrendszer, karosszéria stb.*).  
3. **Akciók kezelése**  
   - Különleges ajánlatok és kedvezmények beállítása adott termékekre vagy termékcsoportokra.  
4. **Rendelések kezelése**  
   - A vásárlók rendelések létrehozása és nyomon követése.  

### **Nem funkcionális követelmények**  
- A rendszer skálázhatósága: Több ezer termék kezelésének támogatása.  
- Felhasználóbarát felület mind vevők, mind adminisztrátorok számára.  
- Biztonságos adatkezelés (pl. felhasználói adatok védelme, SSL).  

---

## **3. Szükséges osztályok**  

### **1. Rendelés osztály**  
- Feladata a vásárlók által leadott rendelések kezelése.  
- Tulajdonságok: rendelési azonosító, terméklista, összár, rendelési státusz (*pl. függőben, feldolgozás alatt, kiszállítva*).  


### **2. Termék osztály**  
- A webshopban forgalmazott termékek leírására szolgál.  
- Tulajdonságok: név, ár, gyártó, cikkszám, kategória, készlet.  

### **3. Felhasználó osztály**  
- Az ügyfelek és adminisztrátorok közös attribútumait tartalmazza.  
- Tulajdonságok: felhasználónév, jelszó, email, szerepkör (admin/vevő).  
 

### **4. Admin osztály** *(a Felhasználó osztályból származik)*  
- Tulajdonságok: admin jogosultságok (pl. akciókezelés).  


### **5. Vevő osztály** *(a Felhasználó osztályból származik)*  
- Tulajdonságok: vásárlási előzmények, kosár tartalma.  
- Metódusok: rendelés leadása, kosár kezelése.  

### **6. Kategória osztály/Enum **
- Autó alkatrészek tipusai(Futómű, Motor, Beltér, Adalék anyagok, Villamossági alkatrészek, Tömítések)
  
### **7. Rendelés szolgáltatás**  
- Feladata a rendelésekkel kapcsolatos folyamatok kezelése.  
- Metódusok: rendelés feldolgozása, státusz frissítése.
- - Metódusok: rendelés létrehozása, állapot módosítása, rendelés lekérdezése.
  - - Metódusok: rendelés leadása, kosár kezelése.  

### **8. Autentikáció szolgáltatás**  
- Felhasználók regisztrációjának és hitelesítésének kezelése.  
- Metódusok: új fiók létrehozása, jelszó hitelesítése, belépés, regisztráció.
  
### 9. **Adminisztrációs szolgáltatás**
- Metódusok: új termék létrehozása, készlet frissítése, termék adatainak módosítása.
- - Metódusok: termékek kezelése, akciók létrehozása, rendelések felügyelete.
    
### **10. Termék megjelenítő**  
- A termékek listázásáért és megjelenítéséért felelős.  
- Metódusok: keresés termék szerint, termék szűrése kategóriák alapján.

   

---  



