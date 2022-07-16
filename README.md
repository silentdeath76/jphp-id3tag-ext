# jphp-Id3Tag-ext

***Code Example***

```php
$mp3 = new Mp3File('./02 skullfucker.mp3');

/** @var Id3v1Tag $id3v1 */
if ($mp3->hasId3v1Tag()) {
  $id3v1 = $mp3->getId3v1Tag();
  var_dump($id3v1->getArtist() . ' - ' . $id3v1->getTitle());
  // result: Centhron - Skullfucker
}

/** @var Id3v2Tag $id3v2 */
if ($mp3->hasId3v2Tag()) {
  $id3v2 = $mp3->getId3v2Tag();
  var_dump($id3v2->getArtist() . ' - ' . $id3v2->getTitle());
  // result: Centhron - Skullfucker
}
```
*Dependencies:* https://github.com/mpatric/mp3agic

*Example project:* https://disk.yandex.ru/d/LjIUhvCtI6emeg
