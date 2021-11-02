<?php
namespace id3Tag;

use \php\io\Stream;

class Id3v2Tag {
    const MIME_IMAGE_PNG = "image/png";
    const MIME_IMAGE_JPEG = "image/jpeg";

    /**
     *
     */
    public function getAlbumImage() {}

    /**
     *
     */
    public function getAlbum() {}

    /**
     *
     */
    public function getArtist() {}

    /**
     *
     */
    public function getComment() {}

    /**
     *
     */
    public function getGenre() {}

    /**
     *
     */
    public function getGenreDescription() {}

    /**
     *
     */
    public function getTitle() {}

    /**
     *
     */
    public function getTrack() {}

    /**
     *
     */
    public function getVersion() {}

    /**
     *
     */
    public function getAlbumArtist() {}

    /**
     * @return \php\io\Stream
     */
    public function getAlbumImageMimeType() {}

    /**
     *
     */
    public function getArtistUrl() {}

    /**
     *
     */
    public function getYear() {}

    /**
     *
     */
    public function getAudiofileUrl() {}

    /**
     *
     */
    public function getBPM() {}

    /**
     *
     */
    public function getKey() {}

    /**
     *
     */
    public function getDate() {}

    /**
     *
     */
    public function getComposer() {}

    /**
     *
     */
    public function getPublisher() {}

    /**
     *
     */
    public function getOriginalArtist() {}

    /**
     *
     */
    public function getCopyright() {}

    /**
     *
     */
    public function getCommercialUrl() {}

    /**
     *
     */
    public function getCopyrightUrl() {}

    /**
     *
     */
    public function getAudioSourceUrl() {}

    /**
     *
     */
    public function getRadiostationUrl() {}

    /**
     *
     */
    public function getPaymentUrl() {}

    /**
     *
     */
    public function getPublisherUrl() {}

    /**
     *
     */
    public function getUrl() {}

    /**
     *
     */
    public function getEncoder() {}

    /**
     *
     */
    public function getWmpRating() {}

    /**
     *
     */
    public function getItunesComment() {}

    /**
     *
     */
    public function getLyrics() {}

    /**
     *
     */
    public function getDataLength() {}

    /**
     *
     */
    public function getLength() {}

    /**
     *
     */
    public function getObseleteFormat() {}

    /**
     *
     */
    public function getPadding() {}

    /**
     *
     */
    public function getGrouping() {}

    /**
     *
     */
    public function getPartOfSet() {}



    public function setAlbum($string, $mimeType = null) {}
    public function setArtist($string) {}
    public function setGenre($int) {}
    public function setGenreDescription($string) {}
    public function setTitle($string) {}
    public function setTrack($string) {}
    public function setAlbumArtist($string) {}
    public function setAlbumImage($path) {}
    public function setArtistUrl($string) {}
    public function setYear($string) {}
    public function setAudiofileUrl($string) {}
    public function setBPM($integer) {}
    public function setKey($string) {}
    public function setDate($string) {}
    public function setComposer($string) {}
    public function setPublisher($string) {}
    public function setOriginalArtist($string) {}
    public function setCopyright($string) {}
    public function setCommercialUrl($string) {}
    public function setCopyrightUrl($string) {}
    public function setAudioSourceUrl($string) {}
    public function setRadiostationUrl($string) {}
    public function setPaymentUrl($string) {}
    public function setPublisherUrl($string) {}
    public function setUrl($string) {}
    public function setEncoder($string) {}
    public function setWmpRating($integer) {}
    public function setItunesComment($string) {}
    public function setLyrics($string) {}
    public function setPadding($boolean) {}
    public function setPartOfSet($string) {}
}