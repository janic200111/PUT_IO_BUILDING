Dokumentacja dla klasy GenerateOutputJson:

Klasa posiada atrybut buildings, który przechowuje listę budynków.
Klasa posiada atrybut errorJson zawierający odpowiedź w przypadku błędnego adresu URL.
Klasa posiada konstruktor, który uzupełnia atrybut buildings za pomocą metody getJson() z klasy ParseJson.
Klasa posiada trzy publiczne metody: getBuildingInfo(String buildingId, String info), getFloorInfo(String buildingId, String floorId, String info), getRoomInfo(String buildingId, String floorId, String roomId, String info)
Każda z metod przyjmuje adres URL zawierający informacje o budynku/piętrze/pokoju i informację, którą ma zwrócić, a następnie generuje odpowiedź w formacie JSON. W przypadku nieprawidłowych danych w adresie URL zwraca atrybut errorJson