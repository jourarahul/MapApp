package com.example.rahul.mapapp.Modals;

import android.net.Uri;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Rahul on 8/4/2018.
 */

public class PlaceInfo  {

    private String name;
    private String address;
    private String phoneNumber;
    private String id;
    private Uri website;
    private LatLng latLng;
    private float rating;
    private String attributions;

    public PlaceInfo(String name, String address, String phoneNumber, String id, Uri website, LatLng latLng, float rating, String attributions) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.id = id;
        this.website = website;
        this.latLng = latLng;
        this.rating = rating;
        this.attributions = attributions;
    }
    public PlaceInfo()
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Uri getWebsite() {
        return website;
    }

    public void setWebsite(Uri website) {
        this.website = website;
    }

    public LatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getAttributions() {
        return attributions;
    }

    public void setAttributions(String attributions) {
        this.attributions = attributions;
    }

    @Override
    public String toString() {
        return "PlaceInfo{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", id='" + id + '\'' +
                ", website=" + website +
                ", latLng=" + latLng +
                ", rating=" + rating +
                ", attributions='" + attributions + '\'' +
                '}';
    }
}
