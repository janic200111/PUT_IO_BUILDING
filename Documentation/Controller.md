Dokumentacja dla klasy Controller:

Klasa jest kontrolerem REST, który udostępnia interfejs API dla budynku.
Klasa używa adnotacji @RestController, @RequestMapping i @GetMapping z pakietu org.springframework.web.bind.annotation.
Klasa posiada trzy metody mapujące odpowiednio na adres URL /building/{buildingId}/{info}, /building/{buildingId}/{floorId}/{info}, /building/{buildingId}/{floorId}/{roomId}/{info}
Każda z metod przyjmuje parametry z adresu URL i przekazuje je do metod klasy GenerateOutputJson, która generuje odpowiedź w formacie JSON.