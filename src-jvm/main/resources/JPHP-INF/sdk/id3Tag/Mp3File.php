<?php
namespace id3Tag;

use \php\time\Time;

/**
 * Class Mp3File
 * @packages id3tag
 */
class Mp3File {
    /**
     * Mp3File constructor.
     */
    public function __construct($file)
    {
    }

    /**
     *
     */
    public function hasCustomTag () {}

    /**
     *
     */
    public function hasId3v1Tag () {}

    /**
     *
     */
    public function hasId3v2Tag () {}

    /**
     * @return Id3v1Tag
     */
    public function getId3v1Tag () {}

    /**
     * @return Id3v2Tag
     */
    public function getId3v2Tag () {}

    /**
     *
     */
    public function getBitrate () {}

    /**
     *
     */
    public function getChannelMode () {}

    /**
     *
     */
    public function getEmphasis () {}

    /**
     *
     */
    public function getVersion () {}

    /**
     * @return Time
     */
    public function getLastModified () {}

    /**
     * @var String $fileName
     */
    public function save ($fileName) {}

    /**
     *
     */
    public function removeCustomTag () {}

    /**
     *
     */
    public function removeId3v1Tag () {}

    /**
     *
     */
    public function removeId3v2Tag () {}

    /**
     *
     */
    public function getLengthInMilliseconds () {}

    /**
     *
     */
    public function getLengthInSeconds () {}

    /**
     *
     */
    public function getFilename () {}

    /**
     * @var String $string
     */
    public function setCustomTag ($string) {}

}