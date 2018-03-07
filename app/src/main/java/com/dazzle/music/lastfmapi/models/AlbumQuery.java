/*
 * Copyright (C) 2015 Naman Dwivedi
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 */

package com.dazzle.music.lastfmapi.models;

import com.google.gson.annotations.SerializedName;

public class AlbumQuery {

    private static final String ALBUM_NAME = "album";
    private static final String ARTIST_NAME = "artist";

    @SerializedName(ALBUM_NAME)
    public String mALbum;

    @SerializedName(ARTIST_NAME)
    public String mArtist;

    public AlbumQuery(String album, String artist) {
        this.mALbum = album;
        this.mArtist = artist;
    }


}
