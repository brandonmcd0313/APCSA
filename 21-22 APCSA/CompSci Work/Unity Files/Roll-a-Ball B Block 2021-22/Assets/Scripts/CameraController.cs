using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class CameraController : MonoBehaviour {

    GameObject player; //reference to player object
    Vector3 offset; //distance from player to camera

	// Use this for initialization
	void Start () {

        //hook up the player reference
        player = GameObject.Find("Player");

        //determine the offset
        //offset = player position - camera position
        offset = player.transform.position - transform.position;

	}
	
	// Update is called once per frame
	void Update () {

        //camera position = player position - offset
        transform.position = player.transform.position - offset;

	}
}
