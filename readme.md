## Проверка цикломатической сложности кода
Для проверки цикломатической сложности кода используется плагин JaCoCo.
Он настраивается в файле pom.xml

Чтобы найти цикломатическую сложность, необходимо запустить    
```
mvn verify
```
После этого в директории
```
...\target\site\jacoco
```
образуются файлы расчетов покрытия автотестами

[Скриншот /target/site/jacoco/ru.netology/Radio.html](https://monosnap.com/file/xM3wImgMIIth6ECrDtkpdOZGGg9n8k)


#### Формула расчета сложности 
```text
C = B - D + 1
```
где 
* B количество ветвей в блоке кода (рёбер в графе)
* D количество условий в блоке кода (узлов в графе).

#### Пример расчета сложности
```java
   public void setNumberNext() {
        if (number == NUMBER_MAX) { //условие #1
            number = NUMBER_MIN;    //ветвь #1
        } else {
            number = number + 1;    //ветвь #2
        }
    }
```
Итого, сложность кода в примере равна 2-1+1=2 

#### Сравнение с максимально рекомендуемой сложностью
Согласно исследованиям, максимально рекомендуемая сложность кода не должна превышать 10.
В прислагаемом коде сложность
```
setNumberNext равна 2
setNumberPrev равна 2
```
что меньше максимально рекомендуемой.
